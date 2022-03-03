package com.abc.match.exception;

public class MatchNotFoundException extends RuntimeException
{
	public MatchNotFoundException(String erroMsg)
	{
		super(erroMsg);
	}
}
