static double	llm(char const *str, int i, int sin)
{
	double	result;
    int MAX = 2147483647;
    int MIN = -2147483648;

	result = 0;
	while(*(str + i) == 48)
		i++;
	while ((*(str + i) >= 48) && (*(str + i) <= 57))
	{
		result = result * 10;
		result += *(str + i) - '0';
        if(sin == 1 && MAX < result)
            return MAX;
        else if( sin == -1 && MIN > result)
            return MIN;
		i++;
	}
	return (result * sin);
}

int	myAtoi(char *str)
{
	int	i;
	int	s;
	double	result;

	result = 0;
	s = 1;
	i = 0;
	while ((*(str + i) == 32))
		i++;
	if (*(str + i) == '-')
	{
		s = -1;
		i++;
	}
	else if (*(str + i) == '+')
		i++;
	return (llm(str, i, s));
}