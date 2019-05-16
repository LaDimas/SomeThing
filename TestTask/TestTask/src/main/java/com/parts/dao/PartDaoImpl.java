package com.parts.dao;

import com.parts.entity.Part;
import com.parts.mapper.PartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class PartDaoImpl implements PartDao{
    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public PartDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(Part part) {
        String sql = "INSERT INTO test.part(name,need,quantity) VALUES (?,?,?)";
        jdbcTemplate.update(sql, part.getName(), part.getNeed(), part.getQuantity());
    }

    @Override
    public Part getByName(String name) {
        String sql = "SELECT * FROM test.part WHERE name LIKE '?'";
        return jdbcTemplate.queryForObject(sql, new PartMapper());
    }

    @Override
    public void delete(String name) {
        String sql = "DELETE FROM test.part WHERE name=?";
        jdbcTemplate.update(sql, name);
    }

    @Override
    public void update(Part part) {
        String sql = "UPDATE test.part SET name=?, need=?, quantity=?";
        jdbcTemplate.update(sql, part.getName(), part.getNeed(),part.getQuantity());
    }

    @Override
    public List<Part> findAll() {
        String sql = "SELECT * FROM test.part";
        return jdbcTemplate.query(sql, new PartMapper());
    }
}
