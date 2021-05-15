package com.finiq.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.trc.main.InputModel;
import com.trc.main.Solution;

public class SolutionTest {

	private Solution solution;
	
	@BeforeEach
	public void setUp() throws Exception{
		solution = new Solution();
	}
	
	@Test
	@DisplayName("Input should be initialized properly")
	public void testInput() {
		assertEquals(initInputModel(), solution.captureInput());
	}
	
	private InputModel initInputModel() {
		InputModel inputModel = new InputModel();
		inputModel.setN(5);
		inputModel.setArrInsert(new int[]{5,23});
		inputModel.setDelPos(0);
		inputModel.setGame(new int[]{12,0,1,78,12});
		inputModel.setnQueries(1);
		return inputModel;
	}

}
