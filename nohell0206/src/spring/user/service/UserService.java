package spring.user.service;

import java.util.List;

import spring.user.dto.UserDto;

public interface UserService {
	//���� ���õ� ����Ͻ� ������ �����ϴ� ���̿� ���� �������̽��� ����.
	
	//������ �Է��ϴ� �޼ҵ� ����
	public void insertUser(UserDto user);
	
	//��������Ʈ�� �޾ƿ��� �޼ҵ� ����
	public List<UserDto> getUserList();
	
	//������  �����ϴ� �޼ҵ� ����
	public void deleteUser(String id);
	
	//������ �����ϴ� �޼ҵ� ����
	public void updateUser(UserDto user);
	
	//������ �ϳ��� �޾ƿ��� �޼ҵ� ����
	public UserDto getUser(String id);
}
