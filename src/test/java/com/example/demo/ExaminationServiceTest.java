package com.example.demo;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExaminationServiceTest {

	private ExaminationService examinationService;

	@BeforeEach
	void setUp() throws Exception {
		examinationService = new ExaminationService();
	}

	@Test
	void 数学の点数と理科の点数が100点の場合に合格ですの値が返却されること() throws Exception {
		String actual = examinationService.passOrFail(100, 100);
		assertThat(actual).isEqualTo("合格です");
	}

	@Test
	void 数学の点数と理科の点数が80点の場合に合格ですの値が返却されること() throws Exception {
		String actual = examinationService.passOrFail(80, 80);
		assertThat(actual).isEqualTo("合格です");
	}

	@Test
	void 数学の点数が80点で理科の点数が79点の場合に追試ですの値が返却されること() throws Exception {
		String actual = examinationService.passOrFail(80, 79);
		assertThat(actual).isEqualTo("追試です");
	}

	@Test
	void 数学の点数が79点で理科の点数が80点の場合に追試ですの値が返却されること() throws Exception {
		String actual = examinationService.passOrFail(79, 80);
		assertThat(actual).isEqualTo("追試です");
	}

	@Test
	void 数学の点数と理科の点数が79点の場合に不合格ですの値が返却されること() throws Exception {
		String actual = examinationService.passOrFail(79, 79);
		assertThat(actual).isEqualTo("不合格です");
	}

	@Test
	void 数学の点数と理科の点数が0点の場合に不合格ですの値が返却されること() throws Exception {
		String actual = examinationService.passOrFail(0, 0);
		assertThat(actual).isEqualTo("不合格です");
	}

	@Test
	void 数学の点数と理科の点数が101点の場合に例外処理されること() {
		assertThatThrownBy(() -> {
			examinationService.passOrFail(101, 101);
		}).isInstanceOf(Exception.class).hasMessage("点数は0から100までの数値を入力してください");
	}

	@Test
	void 数学の点数が101点で理科の点数が100点の場合に例外処理されること() {
		assertThatThrownBy(() -> {
			examinationService.passOrFail(101, 100);
		}).isInstanceOf(Exception.class).hasMessage("点数は0から100までの数値を入力してください");
	}

	@Test
	void 数学の点数が100点で理科の点数が101点の場合に例外処理されること() {
		assertThatThrownBy(() -> {
			examinationService.passOrFail(100, 101);
		}).isInstanceOf(Exception.class).hasMessage("点数は0から100までの数値を入力してください");
	}

	@Test
	void 数学の点数と理科の点数がー1点の場合に例外処理されること() {
		assertThatThrownBy(() -> {
			examinationService.passOrFail(-1, -1);
		}).isInstanceOf(Exception.class).hasMessage("点数は0から100までの数値を入力してください");
	}

	@Test
	void 数学の点数がー1点で理科の点数が0点の場合に例外処理されること() {
		assertThatThrownBy(() -> {
			examinationService.passOrFail(-1, 0);
		}).isInstanceOf(Exception.class).hasMessage("点数は0から100までの数値を入力してください");
	}

	@Test
	void 数学の点数が0点で理科の点数がー1点の場合に例外処理されること() {
		assertThatThrownBy(() -> {
			examinationService.passOrFail(0, -1);
		}).isInstanceOf(Exception.class).hasMessage("点数は0から100までの数値を入力してください");
	}

}
