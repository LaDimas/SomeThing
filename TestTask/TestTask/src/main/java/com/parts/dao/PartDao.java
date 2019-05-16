package com.parts.dao;

import com.parts.entity.Part;

import java.util.List;

public interface PartDao {
    void save(Part part);
    Part getByName(String name);
    void delete(String name);
    void update(Part part);

    List<Part> findAll();
}
