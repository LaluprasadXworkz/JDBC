package com.pes.mobileinfo;

import com.pes.mobileinfo.entity.MobileEntity;
import com.pes.mobileinfo.repo.MobileRepo;
import com.pes.mobileinfo.repo.MobileRepoimpl;

public class MobileRunner {

    public static void main(String[] args) {
        MobileEntity entity1=new MobileEntity();
        entity1.setId(1);
        entity1.setMobileName("Mi note 8 Pro");
        entity1.setBrand("Xiaomi");
        entity1.setPrice(19999.00);
        entity1.setRam("8 GB");

        MobileRepo repo=new MobileRepoimpl();
        repo.saveMobileInfo(entity1);

    }
}
