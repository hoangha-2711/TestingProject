public String condition(int h, int t) 
{
    if (h >= 170 && h <= 190) 
    {
        if ( t >= 18 && t <= 21) 
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
