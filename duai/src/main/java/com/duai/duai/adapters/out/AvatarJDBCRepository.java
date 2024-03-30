package com.duai.duai.adapters.out;

import com.duai.duai.domain.model.Avatar;
import com.duai.duai.domain.ports.AvatarRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AvatarJDBCRepository implements AvatarRepository {
    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<Avatar> avatarRowMapper;

    public AvatarJDBCRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.avatarRowMapper = ((rs, rowNum) -> new Avatar(
                rs.getLong("id"),
                rs.getString("name"),
                rs.getString("lore")

        )) ;
    }
    @Override
    public List<Avatar> findAll(){
        return jdbcTemplate.query("SELECT * FROM AVATARDU", avatarRowMapper);
    }

    @Override
    public Optional<Avatar> findById(Long id) {
        String sql = "SELECT * FROM AVATARDU WHERE ID = ?";
        List<Avatar> avatar = jdbcTemplate.query(sql, avatarRowMapper, id);
        return avatar.stream().findFirst();
    }
}
