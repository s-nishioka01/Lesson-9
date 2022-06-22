package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class ExaminationService {

	public String passOrFail(int mathScore, int scienceScore) throws Exception {
		if (0 <= mathScore && mathScore <= 100 && 0 <= scienceScore && scienceScore <= 100) {
			if (mathScore >= 80 && scienceScore >= 80) {
				return "合格です";
			} else if (mathScore >= 80 || scienceScore >= 80) {
				return "追試です";
			} else {
				return "不合格です";
			}
		} else {
			throw new Exception("点数は0から100までの数値を入力してください");
		}

	}

}
