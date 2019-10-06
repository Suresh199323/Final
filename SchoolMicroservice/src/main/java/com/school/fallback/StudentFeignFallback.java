package com.school.fallback;

import com.school.service.GalleryFeign;
import org.springframework.web.bind.annotation.PathVariable;

public class StudentFeignFallback implements GalleryFeign {
    @Override
    public String findByName(@PathVariable String name) {

        System.out.println("In fallbackkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        return "galleryService is down";
    }
}
