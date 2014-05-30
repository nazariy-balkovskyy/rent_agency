package com.balkovskyy.rentagency.web.dto.builders;

import java.util.ArrayList;
import java.util.List;

import com.balkovskyy.rentagency.web.domain.Comment;
import com.balkovskyy.rentagency.web.dto.CommentDTO;

public class CommentDTOBuilder {
	public static CommentDTO toCommentDTO(Comment comment) {
		CommentDTO dto = new CommentDTO();
		dto.setId(comment.getId());
		//FIXME
//		dto.setUser(comment.getUser());
//		dto.setMark(comment.getMark());
//		dto.setAdvertisement(comment.getAdvertisement());
		dto.setMessage(comment.getMessage());
		dto.setDate(comment.getDate());
		return dto;
	}
	public static List<CommentDTO> toCommentListDTO(List<Comment> list) {
		List<CommentDTO> dtoList = new ArrayList<CommentDTO>();
		for(Comment obj:list){
			dtoList.add(toCommentDTO(obj));
		}
		return dtoList;
	}

}
