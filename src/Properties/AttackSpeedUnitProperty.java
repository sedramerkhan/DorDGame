package Properties;

public class AttackSpeedUnitProperty extends UnitProperty {
    public AttackSpeedUnitProperty(double propertyValue) {
        super(propertyValue);
    }

    @Override
    public double getPropertyValue() {
        return this.propertyValue;
    }

    @Override
    public void setPropertyValue(double propertyValue) {
        this.propertyValue = propertyValue;
    }
}
