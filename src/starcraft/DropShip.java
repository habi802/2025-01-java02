package starcraft;

// 수송기
// 8개의 지상 유닛을 태울 수 있다.
public class DropShip extends FlyingUnit {
    protected GroundUnit[] units = new GroundUnit[8];
    protected int loadedIndex = 0;

    // 유닛 하나를 태운다. 메소드 load
    // 태웠으면 return true, 못 태웠으면 return false
    public boolean load(GroundUnit unit) {
        if (loadedIndex == units.length) {
            return false;
        }

        units[loadedIndex++] = unit;

        return true;
    }

    // 유닛 하나를 떨군다. 메소드명 unload
    // 떨굴 유닛이 없으면 return null;
    public GroundUnit unload() {
        if (loadedIndex == 0) {
            return null;
        }

        GroundUnit unit = units[--loadedIndex];
        units[loadedIndex] = null;
        return unit;
    }
}
