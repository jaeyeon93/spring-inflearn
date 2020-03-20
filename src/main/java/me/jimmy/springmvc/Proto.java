package me.jimmy.springmvc;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "jimmyScope",value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Proto {
}
