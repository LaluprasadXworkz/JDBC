package com.xworkz.mobile.repo;

import com.xworkz.mobile.entity.MobileEntity;

import java.util.List;

public interface MobileRepo {

    void savedMobile(MobileEntity entity);

    List<MobileEntity> getAllMobielEntity();

}
