package com.balkovskyy.rentagency.web.services;

import com.balkovskyy.rentagency.web.domain.Mark;

public interface MarkService {
	Mark findMarkById(Long id);
	Mark save(Mark mark);
	Mark updateMark(Mark mark);
	void deleteMark(Long id);
}
