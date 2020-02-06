package spring.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.user.dao.UserDao;
import spring.user.dto.UserDto;

//서비스의 역할을 할 클래스를 지정하기 위해 어노테이션을 붙여줌.
//스프링의 빈으로 등록함. 컴포넌트의 자식들(빈을 등록할 때 쓰는 어노테이션)
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired//객체를 담음.         
	UserDao userDao;
	
	@Override
	public void insertUser(UserDto user) {
		//dao를 이용해서 user를 삽입한다.
		userDao.insert(user);
	}

	@Override
	public List<UserDto> getUserList() {
		
		return userDao.readAll();
	}

	@Override
	public void deleteUser(String id) {
		//id를 파라미터로 받아서 dao를 이용해 user를 삭제한다.
		userDao.delete(id);
	}

	@Override
	public void updateUser(UserDto user) {
		//dao를 이용해 user의 정보를 갱신한다.
		userDao.update(user);
	}

	@Override
	public UserDto getUser(String id) {
		//dao를 이용하여 user를 가져와 반환한다.
		return userDao.read(id);
	}

}
