package com.oopsw.seongsubean_reportboard_backend.vo;

import lombok.Data;

@Data
public class RequestFreeboardComment {
  private String email;
  private String writer;

  private String content;
}
