package com.honeyjam.member.dao;

import org.apache.ibatis.session.SqlSession;

import com.honeyjam.member.vo.Member;


public class MemberDaoImpl implements MemberDao{
	
private static MemberDaoImpl instance;
	
	private MemberDaoImpl() {
	}

	public static MemberDaoImpl getInstance() {
		if (instance == null) {
			instance = new MemberDaoImpl();
		}
		return instance;
	}

	private String makeSqlId(String id) {
		return "com.honeyjam.member.dao.mapper.memberMapper."+id;
	}
	
	@Override
	public int insertMember(SqlSession session, Member member) {
		return session.insert(makeSqlId("insertMember"), member);
	}

	@Override
	public int updateMemberById(SqlSession session, Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMemberById(SqlSession session, String email) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Member selectMemberById(SqlSession session, String email) {
		return session.selectOne(makeSqlId("selectMemberById"), email);
	}

	@Override
	public Member selectMemberByNickname(SqlSession session, String nickname) {
		return session.selectOne(makeSqlId("selectMemberByNickname"),nickname);
	}

	@Override
	public Member selectMemberByPhone(SqlSession session, String phoneNum) {
		return session.selectOne(makeSqlId("selectMemberByPhone"),phoneNum);
	}

	

	
	
}
