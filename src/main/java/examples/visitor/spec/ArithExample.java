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
			accept01: {
				visit0: {
					double result;
					{
						result = 0.0;
						{
							accept2: {
								accept03: {
									visit2: {
										accept4: {
											accept05: {
												visit4: {
													obj40_currentValue = obj_value;
												}
											}
										}
										obj2_value = obj40_currentValue;
									}
								}
							}
							result = obj40_currentValue;
						}
						{
							accept6: {
								accept07: {
									visit6: {
										accept8: {
											accept09: {
												visit8: {
													accept10: {
														accept011: {
															visit10: {
																obj40_currentValue = 0.5;
															}
														}
													}
													double left = obj40_currentValue;
													accept12: {
														accept013: {
															visit12: {
																accept14: {
																	accept015: {
																		visit14: {
																			obj40_currentValue = obj0_value;
																		}
																	}
																}
																double left0 = obj40_currentValue;
																accept16: {
																	accept017: {
																		visit16: {
																			accept18: {
																				accept019: {
																					visit18: {
																						obj40_currentValue = obj_value;
																					}
																				}
																			}
																			double left1 = obj40_currentValue;
																			accept20: {
																				accept021: {
																					visit20: {
																						obj40_currentValue = obj0_value;
																					}
																				}
																			}
																			double right = obj40_currentValue;
																			obj40_currentValue = left1 / right;
																		}
																	}
																}
																double right = obj40_currentValue;
																obj40_currentValue = left0 + right;
															}
														}
													}
													double right = obj40_currentValue;
													obj40_currentValue = left * right;
												}
											}
										}
										obj0_value = obj40_currentValue;
									}
								}
							}
							result = obj40_currentValue;
						}
						{
							accept22: {
								accept023: {
									visit22: {
										double result0 = obj40_currentValue;
										accept24: {
											accept025: {
												visit24: {
													accept26: {
														accept027: {
															visit26: {
																obj40_currentValue = obj1_value;
															}
														}
													}
													double left = obj40_currentValue;
													accept28: {
														accept029: {
															visit28: {
																accept30: {
																	accept031: {
																		visit30: {
																			accept32: {
																				accept033: {
																					visit32: {
																						obj40_currentValue = obj0_value;
																					}
																				}
																			}
																			double left0 = obj40_currentValue;
																			accept34: {
																				accept035: {
																					visit34: {
																						obj40_currentValue = obj2_value;
																					}
																				}
																			}
																			double right = obj40_currentValue;
																			obj40_currentValue = left0 - right;
																		}
																	}
																}
																obj40_currentValue = Math.abs(obj40_currentValue);
															}
														}
													}
													double right = obj40_currentValue;
													obj40_currentConditionValue = left < right;
												}
											}
										}
										while (obj40_currentConditionValue) {
											accept36: {
												accept037: {
													visit36: {
														double result1;
														{
															result1 = 0.0;
															{
																accept38: {
																	accept039: {
																		visit38: {
																			accept40: {
																				accept041: {
																					visit40: {
																						obj40_currentValue = obj0_value;
																					}
																				}
																			}
																			obj2_value = obj40_currentValue;
																		}
																	}
																}
																result1 = obj40_currentValue;
															}
															{
																accept42: {
																	accept043: {
																		visit42: {
																			accept44: {
																				accept045: {
																					visit44: {
																						accept46: {
																							accept047: {
																								visit46: {
																									obj40_currentValue = 0.5;
																								}
																							}
																						}
																						double left = obj40_currentValue;
																						accept48: {
																							accept049: {
																								visit48: {
																									accept50: {
																										accept051: {
																											visit50: {
																												obj40_currentValue = obj0_value;
																											}
																										}
																									}
																									double left0 = obj40_currentValue;
																									accept52: {
																										accept053: {
																											visit52: {
																												accept54: {
																													accept055: {
																														visit54: {
																															obj40_currentValue = obj_value;
																														}
																													}
																												}
																												double left1 = obj40_currentValue;
																												accept56: {
																													accept057: {
																														visit56: {
																															obj40_currentValue = obj0_value;
																														}
																													}
																												}
																												double right = obj40_currentValue;
																												obj40_currentValue = left1
																														/ right;
																											}
																										}
																									}
																									double right = obj40_currentValue;
																									obj40_currentValue = left0
																											+ right;
																								}
																							}
																						}
																						double right = obj40_currentValue;
																						obj40_currentValue = left
																								* right;
																					}
																				}
																			}
																			obj0_value = obj40_currentValue;
																		}
																	}
																}
																result1 = obj40_currentValue;
															}
														}
														obj40_currentValue = result1;
													}
												}
											}
											result0 = obj40_currentValue;
											accept58: {
												accept059: {
													visit58: {
														accept60: {
															accept061: {
																visit60: {
																	obj40_currentValue = obj1_value;
																}
															}
														}
														double left = obj40_currentValue;
														accept62: {
															accept063: {
																visit62: {
																	accept64: {
																		accept065: {
																			visit64: {
																				accept66: {
																					accept067: {
																						visit66: {
																							obj40_currentValue = obj0_value;
																						}
																					}
																				}
																				double left0 = obj40_currentValue;
																				accept68: {
																					accept069: {
																						visit68: {
																							obj40_currentValue = obj2_value;
																						}
																					}
																				}
																				double right = obj40_currentValue;
																				obj40_currentValue = left0 - right;
																			}
																		}
																	}
																	obj40_currentValue = Math.abs(obj40_currentValue);
																}
															}
														}
														double right = obj40_currentValue;
														obj40_currentConditionValue = left < right;
													}
												}
											}
										}
										obj40_currentValue = result0;
									}
								}
							}
							result = obj40_currentValue;
						}
					}
					obj40_currentValue = result;
				}
			}
		}
		return obj40_currentValue;
	}
}