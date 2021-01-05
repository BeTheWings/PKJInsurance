package global;

public class constant {

	public enum eJob {
		driver("������"), solider("����"), fieldJob("������"), planeCaptain("����"), stewardess("�¹���"), captain("����"),
		sailor("����"), etc("��Ÿ");

		private String text;

		private eJob(String text) {
			this.text = text;

		}

		public String getText() {
			return this.text;
		}
	}

	public static enum retrievalclientInfo {
		category("����ī�װ�"),name("�̸�"),  insuranceName("�����̸�"), gender("�ֹε�Ϲ�ȣ");

		private String value;

		private retrievalclientInfo(String value) {
			this.value = value;
		}

		public String getString() {
			return this.value;
		}

		public int getInt() {
			return Integer.parseInt(this.value);
		}
	}

	public static enum retrievalInfo {
		name("�����̸�"), category("���� ī�װ�"), insuranceMoney("�����"), payIn("���Ա�"), period("����Ⱓ");

		private String value;

		private retrievalInfo(String value) {
			this.value = value;
		}

		public String getString() {
			return this.value;
		}

		public int getInt() {
			return Integer.parseInt(this.value);
		}
	}

	public static enum clientTable {
		name("�� �̸�"), category("���� ī�װ�"), insurance("����"), id("����"), phnoe("��ȭ��ȣ"), history("�̷�");

		private String value;

		private clientTable(String value) {
			this.value = value;
		}

		public String getString() {
			return this.value;
		}

		public int getInt() {
			return Integer.parseInt(this.value);
		}
	}

	public static enum accidentTable {
		clientName("�̸�"), name("�����̸�"), category("���� ī�װ�"), phone("��ȭ��ȣ"), accident("�����");

		private String value;

		private accidentTable(String value) {
			this.value = value;
		}

		public String getString() {
			return this.value;
		}

		public int getInt() {
			return Integer.parseInt(this.value);
		}
	}

	public enum eBoatType {
		// ���� �˻��� �����ؾ���
		smallShip("������"), midShip("������"), largeShip("������");

		private String text;

		private eBoatType(String text) {
			this.text = text;

		}

		public String getText() {
			return this.text;
		}
	}

	public enum ecarType {
		lightCar("����"), midSizeCar("������"), largeCar("������");

		private String text;

		private ecarType(String text) {
			this.text = text;

		}

		public String getText() {
			return this.text;
		}
	}

	public enum eBuildingType {

		wood("��������"), etc("��Ÿ");

		private String text;

		private eBuildingType(String text) {
			this.text = text;

		}

		public String getText() {
			return this.text;
		}
	}

	public enum eLandType {
		mountain("��"), ricePaddy("��"), field("��"), farm("����"), fruitFarm("������");

		private String text;

		private eLandType(String text) {
			this.text = text;

		}

		public String getText() {
			return this.text;
		}
	}

	public enum eGender {
		woman("����"), man("����");

		private String text;

		private eGender(String text) {
			this.text = text;
		}

		public String getText() {
			return this.text;
		}
	}

	public enum eLongTerm {
		longTerm("��⺸��"), shortTerm("�ܱ⺸��");

		private String text;

		private eLongTerm(String text) {
			this.text = text;
		}

		public String getText() {
			return this.text;
		}
	}

	public enum eAccept {
		accept("������"), reject("�������� ����");

		private String text;

		private eAccept(String text) {
			this.text = text;
		}

		public String getText() {
			return this.text;
		}
	}

	public enum eOnTheSeaType {
		hullOfShip("��ü����"), shipNavigation("�������غ���"), dryingsheep("��������"), nonOperation("���ںҰ����սǺ���"), Freight("���Ӻ���"),
		war("���ﺸ��");

		private String text;

		private eOnTheSeaType(String text) {
			this.text = text;
		}

		public String getText() {
			return this.text;
		}
	}

	public enum eSpecialType {
		injury("���غ���"), compensation("���å�Ӻ���"), theft("��������"), leisure("�������պ���"), childhoodEduInstitution("���Ʊ���������պ���"),
		chattel("���꺸��"), travel("���ຸ��"), contingency("��Ƽ���ú���");

		private String text;

		private eSpecialType(String text) {
			this.text = text;
		}

		public String getText() {
			return this.text;
		}
	}

	public enum eAccidentHistory {
		yes("��� �̷� ����"), no("��� �̷� ����");

		private String text;

		private eAccidentHistory(String text) {
			this.text = text;
		}

		public String getText() {
			return this.text;
		}
	}
}