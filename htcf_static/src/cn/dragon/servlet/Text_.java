package cn.dragon.servlet;

import java.io.UnsupportedEncodingException;

public class Text_ {
	
	/**
	 * ����ISO8859-1���뷽ʽʱ��һ����/Ӣ�Ķ�ֻռһ���ֽڣ�����GB2312��GBK���뷽ʽʱ��
	 * һ������ռ�����ֽڣ�������UTF-8���뷽ʽʱ��һ������ռ�����ֽ�
	 * @param args
	 * @throws caffcoo
	 */
	public static void main1(String []args) throws UnsupportedEncodingException  {  
	    // ���н����2  
	    System.out.println("�ֳ�".getBytes("ISO8859-1").length);  
	    // ���н����4  
	    System.out.println("�ֳ�".getBytes("GB2312").length);  
	    // ���н����4  
	    System.out.println("�ֳ�".getBytes("GBK").length);  
	    // ���н����6  
	    System.out.println("�ֳ�".getBytes("UTF-8").length);  
	}  
	
	private static String getMsgContent() {  
	    StringBuffer buffer = new StringBuffer();  
	    // ÿ��70�����֣���682�����ּ�1��Ӣ�ĵĸ�̾��  
	    buffer.append("��֪��ʲôʱ��ʼϲ������ÿ��ҹ�ﶼ�������￴���㳤�ö�ô�������Ҳ��ܲ����㿴�������Ҿ���ʧ���Լ�����ǣ������߹����������ʲô�����Ҷ�����");  
	    buffer.append("��֪��ʲôʱ��ʼϲ������ÿ��ҹ�ﶼ�������￴���㳤�ö�ô�������Ҳ��ܲ����㿴�������Ҿ���ʧ���Լ�����ǣ������߹����������ʲô�����Ҷ�����");  
	    buffer.append("��֪��ʲôʱ��ʼϲ������ÿ��ҹ�ﶼ�������￴���㳤�ö�ô�������Ҳ��ܲ����㿴�������Ҿ���ʧ���Լ�����ǣ������߹����������ʲô�����Ҷ�����");  
	    buffer.append("��֪��ʲôʱ��ʼϲ������ÿ��ҹ�ﶼ�������￴���㳤�ö�ô�������Ҳ��ܲ����㿴�������Ҿ���ʧ���Լ�����ǣ������߹����������ʲô�����Ҷ�����");  
	    buffer.append("��֪��ʲôʱ��ʼϲ������ÿ��ҹ�ﶼ�������￴���㳤�ö�ô�������Ҳ��ܲ����㿴�������Ҿ���ʧ���Լ�����ǣ������߹����������ʲô�����Ҷ�����");  
	    buffer.append("��֪��ʲôʱ��ʼϲ������ÿ��ҹ�ﶼ�������￴���㳤�ö�ô�������Ҳ��ܲ����㿴�������Ҿ���ʧ���Լ�����ǣ������߹����������ʲô�����Ҷ�����");  
	    buffer.append("��֪��ʲôʱ��ʼϲ������ÿ��ҹ�ﶼ�������￴���㳤�ö�ô�������Ҳ��ܲ����㿴�������Ҿ���ʧ���Լ�����ǣ������߹����������ʲô�����Ҷ�����");  
	    buffer.append("��֪��ʲôʱ��ʼϲ������ÿ��ҹ�ﶼ�������￴���㳤�ö�ô�������Ҳ��ܲ����㿴�������Ҿ���ʧ���Լ�����ǣ������߹����������ʲô�����Ҷ�����");  
	    buffer.append("��֪��ʲôʱ��ʼϲ������ÿ��ҹ�ﶼ�������￴���㳤�ö�ô�������Ҳ��ܲ����㿴�������Ҿ���ʧ���Լ�����ǣ������߹����������ʲô�����Ҷ�����");  
	    buffer.append("��֪��ʲôʱ��ʼϲ������ÿ��ҹ�ﶼ�������￴���㳤�ö�ô�������Ҳ��ܲ����㿴�������Ҿ���ʧ���Լ�����ǣ!");  
	    return buffer.toString();  
	}  
	  
	public static void main(String []args) throws Exception  {  
	    // ����gb2312���뷽ʽʱռ1365���ֽ�  
	    System.out.println(getMsgContent().getBytes("gb2312").length);  
	    // ����utf-8���뷽ʽʱռ2047���ֽ�  
	    System.out.println(getMsgContent().getBytes("utf-8").length);  
	}

}
