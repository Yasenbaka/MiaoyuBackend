CREATE TABLE IF NOT EXISTS invoice (
    id VARCHAR(30) PRIMARY KEY ,
    type VARCHAR(20) NOT NULL COMMENT '发票类型: SPECIAL-专票, NORMAL-普票',
    property VARCHAR(20) NOT NULL COMMENT '发票性质: INPUT-进项, OUTPUT-销项',
    status VARCHAR(20) NOT NULL ,
    seller VARCHAR(100) NOT NULL ,
    seller_id VARCHAR(18) NOT NULL ,
    purchaser VARCHAR(100) NOT NULL ,
    purchaser_id VARCHAR(18) NOT NULL ,
    before_tax_amount DECIMAL(12, 2) NOT NULL ,
    tax_amount DECIMAL(12, 2) NOT NULL ,
    tax_rate DECIMAL(5, 2) NOT NULL ,
    after_tax_amount DECIMAL(12, 2) NOT NULL ,
    remark TEXT DEFAULT NULL,
    issue_at DATE NOT NULL ,
    create_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP ,

    CONSTRAINT chk_invoice_amount CHECK (
        after_tax_amount = before_tax_amount + tax_amount),

    INDEX idx_seller_id (seller_id),
    INDEX idx_purchaser_id (purchaser_id),
    INDEX idx_issue_at (issue_at)
);

CREATE TABLE IF NOT EXISTS invoice_item (
    id VARCHAR(36) PRIMARY KEY ,
    invoice_id VARCHAR(30) NOT NULL ,
    name VARCHAR(100) NOT NULL ,
    specification VARCHAR(50) DEFAULT NULL ,
    unit VARCHAR(20) NOT NULL ,
    quantity DECIMAL(12, 3) NOT NULL ,
    unit_price DECIMAL(12, 2) NOT NULL ,
    amount DECIMAL(12, 2) NOT NULL ,
    tax_rate DECIMAL(5, 2) NOT NULL ,
    tax_amount DECIMAL(12, 2) NOT NULL ,
    remark TEXT DEFAULT NULL,
    create_at DATETIME DEFAULT CURRENT_TIMESTAMP,
    update_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,

    INDEX idx_invoice_id (invoice_id),

    CONSTRAINT chk_invoice_item_amount CHECK (ABS(amount - quantity * unit_price) < 0.001),
    CONSTRAINT chk_invoice_item_tax CHECK (ABS(tax_amount - amount * tax_rate) < 0.001),

    FOREIGN KEY (invoice_id) REFERENCES invoice(id) ON DELETE CASCADE
);
CREATE TABLE IF NOT EXISTS invoice_bind (
    id VARCHAR(36) PRIMARY KEY ,
    output_invoice_id VARCHAR(30) NOT NULL ,
    input_invoice_id VARCHAR(30) NOT NULL ,
    create_at DATETIME DEFAULT CURRENT_TIMESTAMP,

    UNIQUE KEY uk_output_input_invoice_id (output_invoice_id, input_invoice_id),

    INDEX idx_output_invoice_id (output_invoice_id),
    INDEX idx_input_invoice_id (input_invoice_id),

    FOREIGN KEY (output_invoice_id) REFERENCES invoice(id) ON DELETE CASCADE ,
    FOREIGN KEY (input_invoice_id) REFERENCES invoice(id) ON DELETE CASCADE

);