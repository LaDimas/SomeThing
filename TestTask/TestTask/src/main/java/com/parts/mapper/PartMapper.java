package com.parts.mapper;

import com.parts.entity.Part;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PartMapper implements RowMapper<Part> {
    @Override
    public Part mapRow(ResultSet resultSet, int i) throws SQLException {
        Part part = new Part();
        part.setId(resultSet.getInt("id"));
        part.setName(resultSet.getString("name"));
        part.setNeed(resultSet.getInt("need"));
        part.setQuantity(resultSet.getInt("quantity"));
        return part;
    }
}
