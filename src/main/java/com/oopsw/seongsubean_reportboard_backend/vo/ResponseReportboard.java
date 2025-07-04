package com.oopsw.seongsubean_reportboard_backend.vo;

import lombok.Data;

@Data
public class ResponseReportboard {
  private Long id;

  private String email;
  private String writer;

  private String title;
  private String content;
  private String headWord;
  private String images;


}
