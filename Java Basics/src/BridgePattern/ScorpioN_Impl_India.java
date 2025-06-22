package BridgePattern;

public class ScorpioN_Impl_India extends AbstractScorpioImpl {
    @Override
    void printSafetyReq() {
        System.out.println("Safety Requirement for India Region ");
    }
    @Override
    boolean isRightHanded() {
        return true;
    }
}
