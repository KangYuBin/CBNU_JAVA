import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Company {
	public static void main(String args[]) {
		String result = ""; // ��� ���ڿ�
		Employee obj=null;
		String empNum = null; // �����ȣ�� �Է¹޴� ����
		String name = null; // �̸��� �Է¹޴� ����
		String part = null; // �μ��� �Է¹޴� ����
		String position = null; // ��å�� �Է¹޴� ����
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("��� �Է�(��)A1010 : ");
			empNum = in.readLine();
			System.out.print("�̸� �Է�(��)�ڹ��� :");
			name = in.readLine();
			System.out.print("�μ� �Է�(��)��ȹ :");
			part = in.readLine();
			System.out.print("��å �Է�(��)���-1, �븮-2, ����-3 :");
			position = in.readLine();
			System.out.println("��å�� ����̸� ��å�� ǥ�õ��� �ʽ��ϴ�.");
		} catch (Exception e) {
			System.out.println("�Է� ����");
		}
		// position�� ���� "1"�̸� ���, �׿��̸� ������
		if (position.equals("1")) { // ���
			// EmployeeŬ������ ��üobj�� ����
			obj = new Employee(empNum, name, part);
			result += obj.resultStr();
		} else { // ������
			// position�� ���� "2"�̸� �븮��, �׿��̸� �������� ��ġ
			position = (position.equals("2")) ? "�븮" : "����";
			// ManagerŬ������ ��ü obj�� ����
			obj = new Manager(empNum, name, part, position);
			//result += mng.resultStr() + mng.addStr();
			
			result+=obj.resultStr();
		}

		// ��� ���ڿ��� �ֿܼ� ���
		System.out.println(result);
	}
}
