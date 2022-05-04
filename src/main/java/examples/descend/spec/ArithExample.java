package examples.descend.spec;


import ru.psiras.spec.annotations.Specialize;
import examples.descend.arithexpressions.*;
import examples.descend.booleanexpression.BooleanExpression;
import examples.descend.booleanexpression.BooleanOperator;
import examples.descend.statements.*;
import examples.descend.*;

public class ArithExample {
	@Specialize
	public static final double sqrt(double a, double dEps) {
		double obj_value;
		double obj0_value;
		double obj1_value;
		double obj2_value;
		obj_value = a;
		obj0_value = 1.0;
		obj1_value = dEps;
		double ret_execute;
		execute0: {
			double result;
			{
				result = 0.0;
				{
					double ret_executeStatement;
					executeStatement0: {
						double ret_processAssignment;
						processAssignment0: {
							double ret_executeArithExpression;
							executeArithExpression0: {
								double ret_variable;
								variable0: {
									ret_variable = obj_value;
								}
								{
									ret_executeArithExpression = ret_variable;
								}
							}
							obj2_value = ret_executeArithExpression;
							{
								ret_processAssignment = obj2_value;
							}
						}
						{
							ret_executeStatement = ret_processAssignment;
						}
					}
					result = ret_executeStatement;
				}
				{
					double ret_executeStatement1;
					executeStatement2: {
						double ret_processAssignment1;
						processAssignment2: {
							double ret_executeArithExpression1;
							executeArithExpression2: {
								double ret_operator;
								operator0: {
									double ret_executeArithOperator;
									executeArithOperator0: {
										double ret_mult;
										mult0: {
											double ret_executeArithExpression3;
											executeArithExpression4: {
												double ret_value;
												value0: {
													ret_value = 0.5;
												}
												{
													ret_executeArithExpression3 = 0.5;
												}
											}
											double left0 = ret_executeArithExpression3;
											double ret_executeArithExpression5;
											executeArithExpression6: {
												double ret_operator1;
												operator2: {
													double ret_executeArithOperator1;
													executeArithOperator2: {
														double ret_sum;
														sum0: {
															double ret_executeArithExpression7;
															executeArithExpression8: {
																double ret_variable1;
																variable2: {
																	ret_variable1 = obj0_value;
																}
																{
																	ret_executeArithExpression7 = ret_variable1;
																}
															}
															double left1 = ret_executeArithExpression7;
															double ret_executeArithExpression9;
															executeArithExpression10: {
																double ret_operator3;
																operator4: {
																	double ret_executeArithOperator3;
																	executeArithOperator4: {
																		double ret_div;
																		div0: {
																			double ret_executeArithExpression11;
																			executeArithExpression12: {
																				double ret_variable3;
																				variable4: {
																					ret_variable3 = obj_value;
																				}
																				{
																					ret_executeArithExpression11 = ret_variable3;
																				}
																			}
																			double left2 = ret_executeArithExpression11;
																			double ret_executeArithExpression13;
																			executeArithExpression14: {
																				double ret_variable5;
																				variable6: {
																					ret_variable5 = obj0_value;
																				}
																				{
																					ret_executeArithExpression13 = ret_variable5;
																				}
																			}
																			double right0 = ret_executeArithExpression13;
																			{
																				ret_div = left2 / right0;
																			}
																		}
																		{
																			ret_executeArithOperator3 = ret_div;
																		}
																	}
																	double result0 = ret_executeArithOperator3;
																	{
																		ret_operator3 = result0;
																	}
																}
																{
																	ret_executeArithExpression9 = ret_operator3;
																}
															}
															double right0 = ret_executeArithExpression9;
															{
																ret_sum = left1 + right0;
															}
														}
														{
															ret_executeArithOperator1 = ret_sum;
														}
													}
													double result0 = ret_executeArithOperator1;
													{
														ret_operator1 = result0;
													}
												}
												{
													ret_executeArithExpression5 = ret_operator1;
												}
											}
											double right0 = ret_executeArithExpression5;
											{
												ret_mult = left0 * right0;
											}
										}
										{
											ret_executeArithOperator = ret_mult;
										}
									}
									double result0 = ret_executeArithOperator;
									{
										ret_operator = result0;
									}
								}
								{
									ret_executeArithExpression1 = ret_operator;
								}
							}
							obj0_value = ret_executeArithExpression1;
							{
								ret_processAssignment1 = obj0_value;
							}
						}
						{
							ret_executeStatement1 = ret_processAssignment1;
						}
					}
					result = ret_executeStatement1;
				}
				{
					double ret_executeStatement3;
					executeStatement4: {
						double ret_processWhile;
						processWhile0: {
							double result0;
							boolean ret_executeBoolExpression;
							executeBoolExpression0: {
								boolean ret_executeBoolOperator;
								executeBoolOperator0: {
									boolean ret_less;
									less0: {
										double ret_executeArithExpression15;
										executeArithExpression16: {
											double ret_variable7;
											variable8: {
												ret_variable7 = obj1_value;
											}
											{
												ret_executeArithExpression15 = ret_variable7;
											}
										}
										double left0 = ret_executeArithExpression15;
										double ret_executeArithExpression17;
										executeArithExpression18: {
											double ret_abs;
											abs0: {
												double result1;
												double ret_executeArithExpression19;
												executeArithExpression20: {
													double ret_operator5;
													operator6: {
														double ret_executeArithOperator5;
														executeArithOperator6: {
															double ret_sub;
															sub0: {
																double ret_executeArithExpression21;
																executeArithExpression22: {
																	double ret_variable9;
																	variable10: {
																		ret_variable9 = obj0_value;
																	}
																	{
																		ret_executeArithExpression21 = ret_variable9;
																	}
																}
																double left1 = ret_executeArithExpression21;
																double ret_executeArithExpression23;
																executeArithExpression24: {
																	double ret_variable11;
																	variable12: {
																		ret_variable11 = obj2_value;
																	}
																	{
																		ret_executeArithExpression23 = ret_variable11;
																	}
																}
																double right0 = ret_executeArithExpression23;
																{
																	ret_sub = left1 - right0;
																}
															}
															{
																ret_executeArithOperator5 = ret_sub;
															}
														}
														double result2 = ret_executeArithOperator5;
														{
															ret_operator5 = result2;
														}
													}
													{
														ret_executeArithExpression19 = ret_operator5;
													}
												}
												result1 = ret_executeArithExpression19;
												{
													ret_abs = Math.abs(result1);
												}
											}
											{
												ret_executeArithExpression17 = ret_abs;
											}
										}
										double right0 = ret_executeArithExpression17;
										{
											ret_less = left0 < right0;
										}
									}
									{
										ret_executeBoolOperator = ret_less;
									}
								}
								boolean result1 = ret_executeBoolOperator;
								{
									ret_executeBoolExpression = result1;
								}
							}
							boolean iterExpression = ret_executeBoolExpression;
							{
								result0 = 0.0;
								while (iterExpression) {
									double ret_execute1;
									execute2: {
										double result1;
										{
											result1 = 0.0;
											{
												double ret_executeStatement5;
												executeStatement6: {
													double ret_processAssignment3;
													processAssignment4: {
														double ret_executeArithExpression25;
														executeArithExpression26: {
															double ret_variable13;
															variable14: {
																ret_variable13 = obj0_value;
															}
															{
																ret_executeArithExpression25 = ret_variable13;
															}
														}
														obj2_value = ret_executeArithExpression25;
														{
															ret_processAssignment3 = obj2_value;
														}
													}
													{
														ret_executeStatement5 = ret_processAssignment3;
													}
												}
												result1 = ret_executeStatement5;
											}
											{
												double ret_executeStatement7;
												executeStatement8: {
													double ret_processAssignment5;
													processAssignment6: {
														double ret_executeArithExpression27;
														executeArithExpression28: {
															double ret_operator7;
															operator8: {
																double ret_executeArithOperator7;
																executeArithOperator8: {
																	double ret_mult1;
																	mult2: {
																		double ret_executeArithExpression29;
																		executeArithExpression30: {
																			double ret_value1;
																			value2: {
																				ret_value1 = 0.5;
																			}
																			{
																				ret_executeArithExpression29 = 0.5;
																			}
																		}
																		double left0 = ret_executeArithExpression29;
																		double ret_executeArithExpression31;
																		executeArithExpression32: {
																			double ret_operator9;
																			operator10: {
																				double ret_executeArithOperator9;
																				executeArithOperator10: {
																					double ret_sum1;
																					sum2: {
																						double ret_executeArithExpression33;
																						executeArithExpression34: {
																							double ret_variable15;
																							variable16: {
																								ret_variable15 = obj0_value;
																							}
																							{
																								ret_executeArithExpression33 = ret_variable15;
																							}
																						}
																						double left1 = ret_executeArithExpression33;
																						double ret_executeArithExpression35;
																						executeArithExpression36: {
																							double ret_operator11;
																							operator12: {
																								double ret_executeArithOperator11;
																								executeArithOperator12: {
																									double ret_div1;
																									div2: {
																										double ret_executeArithExpression37;
																										executeArithExpression38: {
																											double ret_variable17;
																											variable18: {
																												ret_variable17 = obj_value;
																											}
																											{
																												ret_executeArithExpression37 = ret_variable17;
																											}
																										}
																										double left2 = ret_executeArithExpression37;
																										double ret_executeArithExpression39;
																										executeArithExpression40: {
																											double ret_variable19;
																											variable20: {
																												ret_variable19 = obj0_value;
																											}
																											{
																												ret_executeArithExpression39 = ret_variable19;
																											}
																										}
																										double right0 = ret_executeArithExpression39;
																										{
																											ret_div1 = left2
																													/ right0;
																										}
																									}
																									{
																										ret_executeArithOperator11 = ret_div1;
																									}
																								}
																								double result2 = ret_executeArithOperator11;
																								{
																									ret_operator11 = result2;
																								}
																							}
																							{
																								ret_executeArithExpression35 = ret_operator11;
																							}
																						}
																						double right0 = ret_executeArithExpression35;
																						{
																							ret_sum1 = left1 + right0;
																						}
																					}
																					{
																						ret_executeArithOperator9 = ret_sum1;
																					}
																				}
																				double result2 = ret_executeArithOperator9;
																				{
																					ret_operator9 = result2;
																				}
																			}
																			{
																				ret_executeArithExpression31 = ret_operator9;
																			}
																		}
																		double right0 = ret_executeArithExpression31;
																		{
																			ret_mult1 = left0 * right0;
																		}
																	}
																	{
																		ret_executeArithOperator7 = ret_mult1;
																	}
																}
																double result2 = ret_executeArithOperator7;
																{
																	ret_operator7 = result2;
																}
															}
															{
																ret_executeArithExpression27 = ret_operator7;
															}
														}
														obj0_value = ret_executeArithExpression27;
														{
															ret_processAssignment5 = obj0_value;
														}
													}
													{
														ret_executeStatement7 = ret_processAssignment5;
													}
												}
												result1 = ret_executeStatement7;
											}
										}
										{
											ret_execute1 = result1;
										}
									}
									result0 = ret_execute1;
									boolean ret_executeBoolExpression0;
									executeBoolExpression2: {
										boolean ret_executeBoolOperator;
										executeBoolOperator0: {
											boolean ret_less;
											less0: {
												double ret_executeArithExpression15;
												executeArithExpression16: {
													double ret_variable7;
													variable8: {
														ret_variable7 = obj1_value;
													}
													{
														ret_executeArithExpression15 = ret_variable7;
													}
												}
												double left0 = ret_executeArithExpression15;
												double ret_executeArithExpression17;
												executeArithExpression18: {
													double ret_abs;
													abs0: {
														double result1;
														double ret_executeArithExpression19;
														executeArithExpression20: {
															double ret_operator5;
															operator6: {
																double ret_executeArithOperator5;
																executeArithOperator6: {
																	double ret_sub;
																	sub0: {
																		double ret_executeArithExpression21;
																		executeArithExpression22: {
																			double ret_variable9;
																			variable10: {
																				ret_variable9 = obj0_value;
																			}
																			{
																				ret_executeArithExpression21 = ret_variable9;
																			}
																		}
																		double left1 = ret_executeArithExpression21;
																		double ret_executeArithExpression23;
																		executeArithExpression24: {
																			double ret_variable11;
																			variable12: {
																				ret_variable11 = obj2_value;
																			}
																			{
																				ret_executeArithExpression23 = ret_variable11;
																			}
																		}
																		double right0 = ret_executeArithExpression23;
																		{
																			ret_sub = left1 - right0;
																		}
																	}
																	{
																		ret_executeArithOperator5 = ret_sub;
																	}
																}
																double result2 = ret_executeArithOperator5;
																{
																	ret_operator5 = result2;
																}
															}
															{
																ret_executeArithExpression19 = ret_operator5;
															}
														}
														result1 = ret_executeArithExpression19;
														{
															ret_abs = Math.abs(result1);
														}
													}
													{
														ret_executeArithExpression17 = ret_abs;
													}
												}
												double right0 = ret_executeArithExpression17;
												{
													ret_less = left0 < right0;
												}
											}
											{
												ret_executeBoolOperator = ret_less;
											}
										}
										boolean result1 = ret_executeBoolOperator;
										{
											ret_executeBoolExpression0 = result1;
										}
									}
									iterExpression = ret_executeBoolExpression0;
								}
							}
							{
								ret_processWhile = result0;
							}
						}
						{
							ret_executeStatement3 = ret_processWhile;
						}
					}
					result = ret_executeStatement3;
				}
			}
			{
				ret_execute = result;
			}
		}
		return ret_execute;
	}
}