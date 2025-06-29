package com.tarea.marcos.serviceImplements;

import com.tarea.marcos.dto.UsuarioDto;
import com.tarea.marcos.interfaceService.InterfaceUsuarioService;
import com.tarea.marcos.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioServiceImpl implements InterfaceUsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

// Tarea 1:
//    Crear el método getAllUsers() que haga lo siguiente:
//
//    Obtener lista de usuarios desde el repositorio.
//
//    Convertir cada Usuario a UsuarioDto con .stream().map().collect().

    public List<UsuarioDto> getAllUsers() {
        return usuarioRepository.findAll().stream()
                .map(usuario -> new UsuarioDto(
                        usuario.getNombre(),
                        usuario.getCorreo(),
                        usuario.getRol()
                ))
                .collect(Collectors.toList());
    }

}
