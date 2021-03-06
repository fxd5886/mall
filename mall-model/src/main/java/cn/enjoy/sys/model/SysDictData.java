package cn.enjoy.sys.model;

import java.io.Serializable;

public class SysDictData implements Serializable{

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_data.id
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	private String id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_data.type
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	private String type;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_data.code
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	private String code;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_data.cname
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	private String cname;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_data.ename
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	private String ename;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_data.default_value
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	private Integer defaultValue;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_data.valid
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	private Integer valid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_data.parent_id
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	private String parentId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_data.RESV1
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	private String resv1;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_data.RESV2
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	private String resv2;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_dict_data.sort_no
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	private Integer sortNo;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_data.id
	 * @return  the value of sys_dict_data.id
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_data.id
	 * @param id  the value for sys_dict_data.id
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_data.type
	 * @return  the value of sys_dict_data.type
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public String getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_data.type
	 * @param type  the value for sys_dict_data.type
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public void setType(String type) {
		this.type = type == null ? null : type.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_data.code
	 * @return  the value of sys_dict_data.code
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public String getCode() {
		return code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_data.code
	 * @param code  the value for sys_dict_data.code
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_data.cname
	 * @return  the value of sys_dict_data.cname
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public String getCname() {
		return cname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_data.cname
	 * @param cname  the value for sys_dict_data.cname
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public void setCname(String cname) {
		this.cname = cname == null ? null : cname.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_data.ename
	 * @return  the value of sys_dict_data.ename
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public String getEname() {
		return ename;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_data.ename
	 * @param ename  the value for sys_dict_data.ename
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public void setEname(String ename) {
		this.ename = ename == null ? null : ename.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_data.default_value
	 * @return  the value of sys_dict_data.default_value
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public Integer getDefaultValue() {
		return defaultValue;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_data.default_value
	 * @param defaultValue  the value for sys_dict_data.default_value
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public void setDefaultValue(Integer defaultValue) {
		this.defaultValue = defaultValue;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_data.valid
	 * @return  the value of sys_dict_data.valid
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public Integer getValid() {
		return valid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_data.valid
	 * @param valid  the value for sys_dict_data.valid
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public void setValid(Integer valid) {
		this.valid = valid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_data.parent_id
	 * @return  the value of sys_dict_data.parent_id
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public String getParentId() {
		return parentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_data.parent_id
	 * @param parentId  the value for sys_dict_data.parent_id
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public void setParentId(String parentId) {
		this.parentId = parentId == null ? null : parentId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_data.RESV1
	 * @return  the value of sys_dict_data.RESV1
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public String getResv1() {
		return resv1;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_data.RESV1
	 * @param resv1  the value for sys_dict_data.RESV1
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public void setResv1(String resv1) {
		this.resv1 = resv1 == null ? null : resv1.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_data.RESV2
	 * @return  the value of sys_dict_data.RESV2
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public String getResv2() {
		return resv2;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_data.RESV2
	 * @param resv2  the value for sys_dict_data.RESV2
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public void setResv2(String resv2) {
		this.resv2 = resv2 == null ? null : resv2.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_dict_data.sort_no
	 * @return  the value of sys_dict_data.sort_no
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public Integer getSortNo() {
		return sortNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_dict_data.sort_no
	 * @param sortNo  the value for sys_dict_data.sort_no
	 * @mbggenerated  Tue Jun 14 11:21:53 CST 2016
	 */
	public void setSortNo(Integer sortNo) {
		this.sortNo = sortNo;
	}
}