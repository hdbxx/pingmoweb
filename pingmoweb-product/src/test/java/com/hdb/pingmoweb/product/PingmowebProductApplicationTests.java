package com.hdb.pingmoweb.product;

import com.hdb.pingmoweb.product.entity.BrandEntity;
import com.hdb.pingmoweb.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class PingmowebProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("1");
        brandEntity.setLogo("1");
        brandEntity.setSort(2);
        brandEntity.setFirstLetter("1");
        brandEntity.setShowStatus(1);
        brandService.save(brandEntity);
    }

}
