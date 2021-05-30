public class CalcEngineHex extends CalcEngine
{
    //to deal with hexadecimal digits and clear button
    public void numberPressedHex(String number)
    {
        if(number.equals("Clear"))
        {
            clear();
        }

        if(buildingDisplayValue)
        {
            displayValue = displayValue*16 + getNumber(number);
        }
        else
        {
            if(number.equals("A"))
            {
                displayValue = 10;
                buildingDisplayValue = true;
            }
            else if(number.equals("B"))
            {
                displayValue = 11;
                buildingDisplayValue = true;
            }
            else if(number.equals("C"))
            {
                displayValue = 12;
                buildingDisplayValue = true;
            }
            else if(number.equals("D"))
            {
                displayValue = 13;
                buildingDisplayValue = true;
            }
            else if(number.equals("E"))
            {
                displayValue = 14;
                buildingDisplayValue = true;
            }
            else if(number.equals("F"))
            {
                displayValue = 15;
                buildingDisplayValue = true;
            }
        }
    }

    //to show the value in Hexadecimal
    public String getDisplayValueHex()
    {
        return Integer.toHexString(displayValue);
    }

    //to return the value as an Integer
    private int getNumber(String number)
    {
        return switch (number)
                {
            case "A" -> 10;
            case "B" -> 11;
            case "C" -> 12;
            case "D" -> 13;
            case "E" -> 14;
            case "F" -> 15;
            default -> 0;
                };
    }
}
