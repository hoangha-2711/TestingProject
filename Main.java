public String condition(int h, int t) 
{
    if (170 <= h && h <= 190) 
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
        return "valid";
    }
}
