package com.xworkz.mobile.runner;

import com.xworkz.mobile.repo.MobileRepo;
import com.xworkz.mobile.repo.MobileRepoimpl;

public class Main {
    public static void main(String[] args) {
        MobileRepo repo=new MobileRepoimpl();
        repo.getAllMobielEntity();
    }
}
