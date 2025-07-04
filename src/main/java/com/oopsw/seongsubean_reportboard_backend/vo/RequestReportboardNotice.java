package com.oopsw.seongsubean_reportboard_backend.vo;

import lombok.Data;

@Data
public class RequestReportboardNotice {
  private String title;
  private String content;
  private String images;
  private String writer;
}
