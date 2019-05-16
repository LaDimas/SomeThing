package com.parts.service;

import com.parts.dao.PartDao;
import com.parts.entity.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartServiceImpl implements PartService{

    @Autowired
    public PartDao partDao;

    @Override
    public void save(Part part) {
        partDao.save(part);
    }

    @Override
    public Part getByName(String name) {
        return partDao.getByName(name);
    }

    @Override
    public void delete(String name) {
        partDao.delete(name);
    }

    @Override
    public void update(Part part) {
        partDao.update(part);
    }

    public List<Part> findAll() {
        return partDao.findAll();
    }
}
