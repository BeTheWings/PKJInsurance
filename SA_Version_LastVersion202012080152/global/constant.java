package global;

public class constant {

	public enum eJob {
		driver("운전수"), solider("군인"), fieldJob("현장직"), planeCaptain("기장"), stewardess("승무원"), captain("선장"),
		sailor("선원"), etc("기타");

		private String text;

		private eJob(String text) {
			this.text = text;

		}

		public String getText() {
			return this.text;
		}
	}

	public static enum retrievalclientInfo {
		category("보험카테고리"),name("이름"),  insuranceName("보험이름"), gender("주민등록번호");

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
		name("보험이름"), category("보험 카테고리"), insuranceMoney("보험금"), payIn("납입금"), period("보험기간");

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
		name("고객 이름"), category("보험 카테고리"), insurance("보험"), id("나이"), phnoe("전화번호"), history("이력");

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
		clientName("이름"), name("보험이름"), category("보험 카테고리"), phone("전화번호"), accident("사고내용");

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
		// 정보 검색후 수정해야함
		smallShip("소형선"), midShip("중형선"), largeShip("대형선");

		private String text;

		private eBoatType(String text) {
			this.text = text;

		}

		public String getText() {
			return this.text;
		}
	}

	public enum ecarType {
		lightCar("경차"), midSizeCar("중형차"), largeCar("대형차");

		private String text;

		private ecarType(String text) {
			this.text = text;

		}

		public String getText() {
			return this.text;
		}
	}

	public enum eBuildingType {

		wood("나무목재"), etc("기타");

		private String text;

		private eBuildingType(String text) {
			this.text = text;

		}

		public String getText() {
			return this.text;
		}
	}

	public enum eLandType {
		mountain("산"), ricePaddy("논"), field("밭"), farm("목장"), fruitFarm("과수원");

		private String text;

		private eLandType(String text) {
			this.text = text;

		}

		public String getText() {
			return this.text;
		}
	}

	public enum eGender {
		woman("여성"), man("남성");

		private String text;

		private eGender(String text) {
			this.text = text;
		}

		public String getText() {
			return this.text;
		}
	}

	public enum eLongTerm {
		longTerm("장기보험"), shortTerm("단기보험");

		private String text;

		private eLongTerm(String text) {
			this.text = text;
		}

		public String getText() {
			return this.text;
		}
	}

	public enum eAccept {
		accept("동의함"), reject("동의하지 않음");

		private String text;

		private eAccept(String text) {
			this.text = text;
		}

		public String getText() {
			return this.text;
		}
	}

	public enum eOnTheSeaType {
		hullOfShip("선체보험"), shipNavigation("선박항해보험"), dryingsheep("건조보험"), nonOperation("선박불가동손실보험"), Freight("운임보험"),
		war("전쟁보험");

		private String text;

		private eOnTheSeaType(String text) {
			this.text = text;
		}

		public String getText() {
			return this.text;
		}
	}

	public enum eSpecialType {
		injury("상해보험"), compensation("배상책임보험"), theft("도난보험"), leisure("레저종합보험"), childhoodEduInstitution("유아교육기관종합보험"),
		chattel("동산보험"), travel("여행보험"), contingency("컨티전시보험");

		private String text;

		private eSpecialType(String text) {
			this.text = text;
		}

		public String getText() {
			return this.text;
		}
	}

	public enum eAccidentHistory {
		yes("사고 이력 있음"), no("사고 이력 없음");

		private String text;

		private eAccidentHistory(String text) {
			this.text = text;
		}

		public String getText() {
			return this.text;
		}
	}
}