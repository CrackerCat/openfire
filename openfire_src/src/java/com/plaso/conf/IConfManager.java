package com.plaso.conf;

import java.util.List;

public interface IConfManager {

	/**
	 * ʹĳ�˽���
	 * @param confId
	 * @param mid
	 * @return
	 */
	public boolean muteSomeBody(String confId, String mid);
	
	/**
	 * ʹĳ�˿��Է���
	 * @param confId
	 * @param mid
	 * @return
	 */
	public boolean unMuteSomeBody(String confId, String mid);
	
	/**
	 * �����ҽ���
	 * @param confId
	 * @return
	 */
	public boolean muteConference(String confId);
	
	/**
	 * �����ҿ��Է���
	 * @param confId
	 * @return
	 */
	public boolean unMuteConference(String confId);
	
	/**
	 * ����
	 * @param mid
	 * @return
	 */
	public boolean deafSomeBody(String mid);
	
	/**
	 * ĳ�˲�����
	 * @param mid
	 * @return
	 */
	public boolean unDeafSomeBodyDeaf(String mid);
	
	/**
	 * �����ҽ���
	 * @param confId
	 * @return
	 */
	public boolean deafConference(String confId);
	
	/**
	 * �����Ҳ�����
	 * @param confId
	 * @return
	 */
	public boolean unDeafConference(String confId);
	
	/**
	 * ��ȡ��Ա״̬
	 * @param confId
	 * @return
	 */
	public List<ConfMemberBean> getMemState(String confId);
	
	/**
	 * ��������
	 * @param confId
	 * @return
	 */
	public boolean closeConf(String confId);
	
	/**
	 * ���ݺ��к����ȡ��Ա����
	 * @param mid
	 * @return
	 */
	public ConfMemberBean getConfMemberBean(String callNum);
}