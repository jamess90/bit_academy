package abstract_class;

// 추상클래스의 경우는 추상클래스를 상속받아도
// 오버라이딩을 하지 않아도 된다.
// 자식 클래스에서 구현이 가능하기 때문이다.
public abstract class CC extends AA{

	public CC(int n, int m) {
		super(n);
	}

}
