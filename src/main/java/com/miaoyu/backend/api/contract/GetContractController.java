package com.miaoyu.backend.api.contract;

import com.miaoyu.backend.utils.R;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contract")
public class GetContractController {

    /**获取所有合同实体
     * @return List包含所有合同的实体*/
    @GetMapping("/all")
    public ResponseEntity<R> getAllContractControl(
            @RequestHeader("Authorization") String token
    ) {
        return ResponseEntity.ok(null);
    }

    /**根据合同属性获取所有符合条件的合同实体
     * @param property 合同属性
     * @return List包含所有符合条件的合同实体*/
    @GetMapping("/contracts_by_property")
    public ResponseEntity<R> getContractsByPropertyControl(
            @RequestHeader("Authorization") String token,
            @RequestParam("property") String property
    ) {
        return ResponseEntity.ok(null);
    }
}
