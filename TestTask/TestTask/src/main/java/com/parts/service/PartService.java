package com.parts.service;

import com.parts.entity.Part;

import java.util.List;

public interface PartService {
    List<Part> findAll();
    void save(Part part);
    Part getByName(String name);
    void delete(String name);
    void update(Part part);
}
