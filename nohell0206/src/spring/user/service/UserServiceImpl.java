package spring.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.user.dao.UserDao;
import spring.user.dto.UserDto;

//������ ������ �� Ŭ������ �����ϱ� ���� ������̼��� �ٿ���.
//�������� ������ �����. ������Ʈ�� �ڽĵ�(���� ����� �� ���� ������̼�)
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired//��ü�� ����.         
	UserDao userDao;
	
	@Override
	public void insertUser(UserDto user) {
		//dao�� �̿��ؼ� user�� �����Ѵ�.
		userDao.insert(user);
	}

	@Override
	public List<UserDto> getUserList() {
		
		return userDao.readAll();
	}

	@Override
	public void deleteUser(String id) {
		//id�� �Ķ���ͷ� �޾Ƽ� dao�� �̿��� user�� �����Ѵ�.
		userDao.delete(id);
	}

	@Override
	public void updateUser(UserDto user) {
		//dao�� �̿��� user�� ������ �����Ѵ�.
		userDao.update(user);
	}

	@Override
	public UserDto getUser(String id) {
		//dao�� �̿��Ͽ� user�� ������ ��ȯ�Ѵ�.
		return userDao.read(id);
	}

}
