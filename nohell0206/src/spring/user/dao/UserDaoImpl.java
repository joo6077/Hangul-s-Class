package spring.user.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import spring.user.dto.UserDto;

@Repository("userDao")//빈등록
public class UserDaoImpl implements UserDao{

	//쿼리를 실행시켜주는 클래스
	@Autowired
	private SqlSession session;

	
	@Override
	public void insert(UserDto user) {
		session.update("userSession.insertUser", user);//user를 parameterType으로 보내겠다.
	}


	@Override
	public List<UserDto> readAll() {
		return session.selectList("userSession.selectUserList");
	}


	@Override
	public void delete(String id) {
		int rs = session.update("userSession.deleteUser", id);
		System.out.println(rs);
	}


	@Override
	public void update(UserDto user) {
		session.update("userSession.updateUser", user);
	}


	@Override
	public UserDto read(String id) {
		return session.selectOne("userSession.selectUserById", id);
	}



}
