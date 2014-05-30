package com.balkovskyy.rentagency.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balkovskyy.rentagency.web.domain.Mark;
import com.balkovskyy.rentagency.web.repositories.MarkRepository;

@Service
public class MarkServiceImpl implements MarkService{

	@Autowired
	private MarkRepository markRepo;

	@Override
	public Mark findMarkById(Long id) {
		return markRepo.findOne(id);
	}

	@Override
	public Mark save(Mark mark) {
		return markRepo.save(mark);
	}

	@Override
	public Mark updateMark(Mark mark) {
		// TODO Updating fields checking
		return markRepo.save(mark);	
	}

	@Override
	public void deleteMark(Long id) {
		Mark mark = findMarkById(id);
		markRepo.delete(mark);
	}
}
