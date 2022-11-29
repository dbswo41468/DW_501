package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.vo.DeptVO;
import com.example.demo.vo.EmpVo;

/*
 * 추상 클래스와 인터페이스 차이점
 * 
 * 인터페이스 : 메소드 정의
 * 추상 클래스 : 정의, 구현 가능
 * 
 */


@Mapper
public interface EmpMapper {
	
	// 메소드 이름 클릭 -> 알트 쉬프트 j 
	/**
	 * @Since : 2022. 11. 28.
	 * @Author : 미스터 빈
	 * @Return : List<EmpVo> 	
	 * @comment : EMP 테이블 전체 조회
	 */
	List<EmpVo> selectEmp(); // 메소드 정의
	
	
	
	/**
	 * @Since : 2022. 11. 29.
	 * @Author : 미스터 빈
	 * @Return : List<DeptVO> 	
	 * @comment : Dept 테이블 전체 조회
	 */
	List<DeptVO> selectDept();
	
	int insertEmp(EmpVo vo);
}
