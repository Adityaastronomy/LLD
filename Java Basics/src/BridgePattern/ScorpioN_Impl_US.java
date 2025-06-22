package BridgePattern;

public class ScorpioN_Impl_US extends AbstractScorpioImpl {
    @Override
    void printSafetyReq() {
        System.out.println("Safety requiremet for US Region ");
    }
    @Override
    boolean isRightHanded() {
        return false;
    }
}
