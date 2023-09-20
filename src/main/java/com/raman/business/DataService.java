package com.raman.business;

import org.springframework.stereotype.Component;

@Component
public interface DataService {
    default int[] retrieveData() {
        System.out.println("Method not implemented");
        return new int[]{};
    }
}