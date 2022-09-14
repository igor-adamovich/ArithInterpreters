package examples.visitor.spec;


import ru.psiras.spec.annotations.Specialize;
import examples.visitor.nodes.arithexpressions.*;
import examples.visitor.nodes.booleanexpression.*;
import examples.visitor.nodes.statements.*;
import examples.visitor.visitor.ASTVisitor;
import examples.visitor.*;

public class ArithExample {
	@Specialize
	public static final double sqrt(double a, double dEps) {
		double obj_value;
		double obj0_value;
		double obj1_value;
		double obj2_value;
		boolean obj40_currentConditionValue;
		double obj40_currentValue;
		Var0: {
			obj2_value = 0.0;
		}
		Var2: {
			double value = dEps;
			obj1_value = value;
		}
		Var4: {
			obj0_value = 1.0;
		}
		Var6: {
			double value = a;
			obj_value = value;
		}
		accept0: {
			visit0: {
				double result;
				{
					result = 0.0;
					{
						accept2: {
							visit2: {
								accept4: {
									visit4: {
										obj40_currentValue = obj_value;
									}
								}
								obj2_value = obj40_currentValue;
							}
						}
						result = obj40_currentValue;
					}
					{
						accept6: {
							visit6: {
								accept8: {
									visit8: {
										accept10: {
											visit10: {
												obj40_currentValue = 0.5;
											}
										}
										double left = obj40_currentValue;
										accept12: {
											visit12: {
												accept14: {
													visit14: {
														obj40_currentValue = obj0_value;
													}
												}
												double left0 = obj40_currentValue;
												accept16: {
													visit16: {
														accept18: {
															visit18: {
																obj40_currentValue = obj_value;
															}
														}
														double left1 = obj40_currentValue;
														accept20: {
															visit20: {
																obj40_currentValue = obj0_value;
															}
														}
														double right = obj40_currentValue;
														obj40_currentValue = left1 / right;
													}
												}
												double right = obj40_currentValue;
												obj40_currentValue = left0 + right;
											}
										}
										double right = obj40_currentValue;
										obj40_currentValue = left * right;
									}
								}
								obj0_value = obj40_currentValue;
							}
						}
						result = obj40_currentValue;
					}
					{
						accept22: {
							visit22: {
								double result0 = obj40_currentValue;
								accept24: {
									visit24: {
										accept26: {
											visit26: {
												obj40_currentValue = obj1_value;
											}
										}
										double left = obj40_currentValue;
										accept28: {
											visit28: {
												accept30: {
													visit30: {
														accept32: {
															visit32: {
																obj40_currentValue = obj0_value;
															}
														}
														double left0 = obj40_currentValue;
														accept34: {
															visit34: {
																obj40_currentValue = obj2_value;
															}
														}
														double right = obj40_currentValue;
														obj40_currentValue = left0 - right;
													}
												}
												obj40_currentValue = Math.abs(obj40_currentValue);
											}
										}
										double right = obj40_currentValue;
										obj40_currentConditionValue = left < right;
									}
								}
								while (obj40_currentConditionValue) {
									accept36: {
										visit36: {
											double result1;
											{
												result1 = 0.0;
												{
													accept38: {
														visit38: {
															accept40: {
																visit40: {
																	obj40_currentValue = obj0_value;
																}
															}
															obj2_value = obj40_currentValue;
														}
													}
													result1 = obj40_currentValue;
												}
												{
													accept42: {
														visit42: {
															accept44: {
																visit44: {
																	accept46: {
																		visit46: {
																			obj40_currentValue = 0.5;
																		}
																	}
																	double left = obj40_currentValue;
																	accept48: {
																		visit48: {
																			accept50: {
																				visit50: {
																					obj40_currentValue = obj0_value;
																				}
																			}
																			double left0 = obj40_currentValue;
																			accept52: {
																				visit52: {
																					accept54: {
																						visit54: {
																							obj40_currentValue = obj_value;
																						}
																					}
																					double left1 = obj40_currentValue;
																					accept56: {
																						visit56: {
																							obj40_currentValue = obj0_value;
																						}
																					}
																					double right = obj40_currentValue;
																					obj40_currentValue = left1 / right;
																				}
																			}
																			double right = obj40_currentValue;
																			obj40_currentValue = left0 + right;
																		}
																	}
																	double right = obj40_currentValue;
																	obj40_currentValue = left * right;
																}
															}
															obj0_value = obj40_currentValue;
														}
													}
													result1 = obj40_currentValue;
												}
											}
											obj40_currentValue = result1;
										}
									}
									result0 = obj40_currentValue;
									accept58: {
										visit58: {
											accept60: {
												visit60: {
													obj40_currentValue = obj1_value;
												}
											}
											double left = obj40_currentValue;
											accept62: {
												visit62: {
													accept64: {
														visit64: {
															accept66: {
																visit66: {
																	obj40_currentValue = obj0_value;
																}
															}
															double left0 = obj40_currentValue;
															accept68: {
																visit68: {
																	obj40_currentValue = obj2_value;
																}
															}
															double right = obj40_currentValue;
															obj40_currentValue = left0 - right;
														}
													}
													obj40_currentValue = Math.abs(obj40_currentValue);
												}
											}
											double right = obj40_currentValue;
											obj40_currentConditionValue = left < right;
										}
									}
								}
								obj40_currentValue = result0;
							}
						}
						result = obj40_currentValue;
					}
				}
				obj40_currentValue = result;
			}
		}
		return obj40_currentValue;
	}
}