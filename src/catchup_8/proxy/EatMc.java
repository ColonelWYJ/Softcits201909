package catchup_8.proxy;

//ʵ��Logistics�ӿ�
public class EatMc implements Eat{
	//��д�ӿ��еķ���
	//����ķ���ֻ��ģ��ʵ��ҵ���е�������
	public void eat(String stuff){
		System.out.println("Eating the " + stuff + "!");
	};
	public void drink(){
		System.out.println("Drinking the cocacola!");
	};

}
