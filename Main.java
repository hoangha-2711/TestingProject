public String condition(int h, int t) 
{
    if (h >= 170 && h <= 190) 
    {
        if (18 <= t && t <= 21) 
        {
            return "valid";
        }
        else 
        {
            return "invalid";
        }
    }
    else 
    {
        return "invalid";
    }
}
