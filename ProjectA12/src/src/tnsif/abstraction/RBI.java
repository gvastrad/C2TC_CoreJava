package src.tnsif.abstraction;

 abstract class RBI {
	abstract float getRateOfInterest();
}
class SBI extends RBI{

	@Override
	float getRateOfInterest() {
		return 6.2f;
	}
}
	
	class HDFC extends RBI{

		@Override
		float getRateOfInterest() {
			return 6.3f;
		}
}