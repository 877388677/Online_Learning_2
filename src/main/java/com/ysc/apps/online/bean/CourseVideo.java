package com.ysc.apps.online.bean;

public class CourseVideo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_video.id
     *
     * @mbg.generated Fri May 03 09:13:52 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_video.name
     *
     * @mbg.generated Fri May 03 09:13:52 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_video.file
     *
     * @mbg.generated Fri May 03 09:13:52 CST 2019
     */
    private String file;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_video.chapter_id
     *
     * @mbg.generated Fri May 03 09:13:52 CST 2019
     */
    private Long chapterId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_video.id
     *
     * @return the value of course_video.id
     *
     * @mbg.generated Fri May 03 09:13:52 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_video.id
     *
     * @param id the value for course_video.id
     *
     * @mbg.generated Fri May 03 09:13:52 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_video.name
     *
     * @return the value of course_video.name
     *
     * @mbg.generated Fri May 03 09:13:52 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_video.name
     *
     * @param name the value for course_video.name
     *
     * @mbg.generated Fri May 03 09:13:52 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_video.file
     *
     * @return the value of course_video.file
     *
     * @mbg.generated Fri May 03 09:13:52 CST 2019
     */
    public String getFile() {
        return file;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_video.file
     *
     * @param file the value for course_video.file
     *
     * @mbg.generated Fri May 03 09:13:52 CST 2019
     */
    public void setFile(String file) {
        this.file = file == null ? null : file.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_video.chapter_id
     *
     * @return the value of course_video.chapter_id
     *
     * @mbg.generated Fri May 03 09:13:52 CST 2019
     */
    public Long getChapterId() {
        return chapterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_video.chapter_id
     *
     * @param chapterId the value for course_video.chapter_id
     *
     * @mbg.generated Fri May 03 09:13:52 CST 2019
     */
    public void setChapterId(Long chapterId) {
        this.chapterId = chapterId;
    }
}