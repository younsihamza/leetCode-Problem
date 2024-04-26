int minPartitions(char * n)
{
    int max = 0;
    int i = 0;
    while(n[i])
    {
        if(max <  n[i] - '0')
            max = n[i] - '0';
        i++;
    }
    return(max);
}